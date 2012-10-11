(ns ssm.core
	(:use overtone.live))

(def sound-query-filter "type:wav duration:[1 TO 5]")

(def max-sound-cnt 500)


(defn get-snd-ids 
	"Returns a list containing the freesound IDs for the given search term.  The sounds will be of type 'wav' and no longer than 5 seconds"
	[search-term] 
	(take max-sound-cnt (freesound-search [:id] search-term :f sound-query-filter)))

(defn play-search
	"For the given seach string, download and play each sound" 
	[search-term] 
	(map #(let [samp (load-sample (freesound-path %))] (sample-player samp))
	(get-snd-ids search-term)))
