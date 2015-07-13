(ns clef_tools.core-test
  (:require [clojure.test :refer :all])
  (:import [clef_tools.stemmers PolishLight]))

(deftest simple-test
  (let [
        ns (PolishLight.)
    ]
  (is (= (.stem ns "panowie") "pan"))
  (is (= (.stem ns "aktorowi") "aktor"))
  (is (= (.stem ns "kotami") "kot"))
  (is (= (.stem ns "kotach") "kot"))
  (is (= (.stem ns "wodżie") "wod"))
  (is (= (.stem ns "autobuśem") "autobus"))
  (is (= (.stem ns "aktorom") "aktor"))
  (is (= (.stem ns "kotow") "kot"))
  (is (= (.stem ns "aktokze") "aktok"))
  (is (= (.stem ns "aktorzy") "aktor"))
  (is (= (.stem ns "kotami") "kot"))
  (is (= (.stem ns "Rośłjanin") "Rosljan"))))