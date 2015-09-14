(ns clojure-projecteuler.euler_p2_m1-test
  (:require [clojure.test :refer :all]
            [clojure-projecteuler.euler_p2_m1 :refer :all]))

(deftest fibonacci-test
  (testing "Fibonacci 0"
    (is (= 0 (fibonacci-by-number 0))))
  (testing "Fibonacci 1"
    (is (= 1 (fibonacci-by-number 1))))
  (testing "Fibonacci 10"
    (is (= 55 (fibonacci-by-number 10)))))

(deftest fibonacci-by-max-value-test
  (testing "Fibonacci by max 40"
    (is (= [1 2 3 5 8 13 21 34] (fibonacci-by-max-value :max-value 40)))))

(deftest sum-even-test
  (testing "Sum of 40"
    (is (= 44 (sum-even [1 2 3 5 8 13 21 34])))))

(deftest sum-even-fibonacci-test
  (testing "Sum of 40"
    (is (= 44 (sum-even-fibonacci 40))))
  (testing "Sum of 4000000"
    (is (= 4613732 (sum-even-fibonacci 4000000)))))
