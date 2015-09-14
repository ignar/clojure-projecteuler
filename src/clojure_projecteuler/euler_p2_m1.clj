(ns clojure-projecteuler.euler_p2_m1)

(defn fibonacci-by-number
  [num]
  (if (= num 0)
    0
    (if (= num 1)
      1
      (if (> num 1)
        (+
         (fibonacci-by-number (- num 1))
         (fibonacci-by-number (- num 2)))))))

(defn fibonacci-by-max-value
  [& {:keys [max-value]}]
  (loop [current-vector [1 2]
        current-sum 3]
    (if (<= current-sum max-value)
      (let [[plast last] (take-last 2 current-vector)
            sum (+ plast last)
            nvector (conj current-vector sum)
            new-sum (reduce + (take-last 2 nvector))]
        (recur nvector new-sum))
      current-vector)))

(defn sum-even
  [vector]
  (let [even-vector (filter #(= 0 (mod % 2)) vector)]
    (reduce + even-vector)))

(defn sum-even-fibonacci
  [max-value]
  (sum-even (fibonacci-by-max-value :max-value max-value)))
