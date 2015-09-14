(ns clojure-projecteuler.euler_p1_m1)

(defn deviders-vector
  [range x y]
  (loop [iterator 1
         final-numset []]
    (if (>= iterator range)
      final-numset
      (if (or (= 0 (mod iterator x)) (= 0 (mod iterator y)))
          (recur (inc iterator) (conj final-numset iterator))
          (recur (inc iterator) final-numset)))))

(defn sum-of-deviders
  [range x y]
  (reduce + (deviders-vector range x y)))
