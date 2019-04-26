(defn divides[n d] (= (mod n d) 0))

(defn is-prime
  ([n] (is-prime n (cons 2 (range 3 (inc (Math/ceil (Math/sqrt n))) 2))))
  ([n d]
   (or (empty? d)
     (and (not (divides n (first d)))
       (recur n (rest d))))))

(defn primes-to[n]
  (cons 2 (filter is-prime (range 2 n))))

(println (apply + (primes-to 2000000)))
