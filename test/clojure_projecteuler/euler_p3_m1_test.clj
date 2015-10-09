(ns clojure-projecteuler.euler_p3_m1-test
  (:require [clojure.test :refer :all]
            [clojure-projecteuler.euler_p3_m1 :refer :all]))

(deftest square-test
  (testing "square helper function"
    (is (true? (square? 576)))
    (is (true? (square? 16)))
    (is (false? (square? 10))))
  (testing "handle negative numbers"
    (is (true? (square? -16)))))
