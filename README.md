scary-sound-machine
===================
A silly program that automatically downloads and plays scary halloween 
sounds from freesound.org.  


Status 
--------------
This project is just getting started, however, there's a test function working
that allows one to easily play the results of a search string.

Quick Start
--------------
This project uses leiningen and overtone:
http://leiningen.org/
http://overtone.github.com/


Using lein, fire up a Cloure REPL and turn down your speakers:

lein repl
(load-file "src/ssm/core.clj)
(ssm.core/play-search "scream")


Warning!
--------------
Start with you speakers volume very low. 

The underling overtone code will cache the results from the "play-search" call, so next time the same search term is used,
my naive code will attempt to play as many of the sounds as possible. It gets really loud and cause massive clipping; good fun <grin>.

