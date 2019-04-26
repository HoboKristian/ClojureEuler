(defn divides[n d] (= (mod n d) 0))

(defn is-prime
  ([n] (is-prime n 2))
  ([n d]
   (if (== d (inc (Math/ceil (Math/sqrt n))))
     true
     (if (divides n d)
       false
       (recur n (inc d))))))

(defn next-prime[n] ())

(println (nth (cons 1 (cons 2 (filter is-prime (range 2 1000000)))) 10001))

