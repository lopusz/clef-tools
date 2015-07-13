(ns clef_tools.core-test
  (:require [clojure.test :refer :all])
  (:import [clef_tools.stemmers PolishLight]))

(deftest simple-test
  (is (= (PolishLight/stem "panowie") "pan"))
  (is (= (PolishLight/stem "aktorowi") "aktor"))
  (is (= (PolishLight/stem "kotami") "kot"))
  (is (= (PolishLight/stem "kotach") "kot"))
  (is (= (PolishLight/stem "wodżie") "wod"))
  (is (= (PolishLight/stem "autobuśem") "autobus"))
  (is (= (PolishLight/stem "aktorom") "aktor"))
  (is (= (PolishLight/stem "kotow") "kot"))
  (is (= (PolishLight/stem "aktokze") "aktok"))
  (is (= (PolishLight/stem "aktorzy") "aktor"))
  (is (= (PolishLight/stem "kotami") "kot"))
  (is (= (PolishLight/stem "Rośłjanin") "Rosljan")))