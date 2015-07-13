(ns clef-tools.core
  (:refer-clojure :exclude [assert])
  (:import [clef_tools.stopwords Polish])
  (:gen-class))

(defn pl-get-stopwords-clef-short []
  (into #{} Polish/listShort))

(defn -main 
  "Main function of the project."
  [ & args ]
  (println "Hello world!"))

