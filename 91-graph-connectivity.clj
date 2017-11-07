#!/usr/bin/clojure

;; 4clojure.com, problem 91
;; Given a graph, determine whether the graph is connected. A
;; connected graph is such that a path exists between any two given
;; nodes.
;; - Your function must return true if the graph is connected and
;;   false otherwise.
;; - You will be given a set of tuples representing the edges of a
;;   graph. Each member of a tuple being a vertex/node in the graph.  
;; - Each edge is undirected (can be traversed either direction).

(defn is-connected? [edges]
  

(defn run-tests [f]
  [(= true (f #{[:a :a]}))
   (= true (f #{[:a :b]}))
   (= false (f #{[1 2] [2 3] [3 1]
                 [4 5] [5 6] [6 4]}))])

(println "Test results:")
(println (run-tests f91))

