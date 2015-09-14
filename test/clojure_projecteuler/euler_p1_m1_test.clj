(ns clojure-projecteuler.euler_p1_m1-test
  (:require [clojure.test :refer :all]
            [clojure-projecteuler.euler_p1_m1 :refer :all]))

(deftest sum-of-deviders-test
  (testing "Range 10. Deviders 3 and 5"
    (is (= 23 (sum-of-deviders 10 3 5))))
  (testing "Range 1000. Deviders 3 and 5"
    (is (= 233168 (sum-of-deviders 1000 3 5)))))
