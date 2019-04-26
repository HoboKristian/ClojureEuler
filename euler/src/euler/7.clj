(defn divides[n d] (= (mod n d) 0))

(defn is-prime
  ([n] (is-prime n (range 2 (inc (Math/ceil (Math/sqrt n))))))
  ([n d]
   (or (empty? d)
     (and (not (divides n (first d)))
       (recur n (rest d))))))

(defn primes-to[n]
  (cons 2 (filter is-prime (range 2 n))))

(println (nth (primes-to 1000000) 10000))
