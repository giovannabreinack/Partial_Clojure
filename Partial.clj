; Partial 01
(defn soma [a b] (+ a b))
(def soma10 (partial soma 10))
(println (soma10 100))

; Partial 02
(defn converter-temp [m s t] (* (+ t s) m))
(def kelvin-para-celsius(partial converter-temp 1.0 -273.15))
(println (kelvin-para-celsius 250.0))
(println (kelvin-para-celsius 359.0))
(def faranheit-para-celsius
  (partial converter-temp (/ 5 9) -32))
(println (faranheit-para-celsius 80.0))

; Partial 05
(defn calculadora [f a b] (f a b))
(println "Soma:" (calculadora + 5 6))
(def subtracao (partial calculadora -))
(println "Subtração:" (subtracao 6 3))
(def multiplicacao (partial calculadora *))
(println "Multiplicação:" (multiplicacao 9 2))
(def divisao (partial calculadora /))
(println "Divisão:" (divisao 9 3))

; Curryng 01
(defn soma [a] (fn [b] (+ a b)))
(println ((soma 5) 11))
(def soma5 (soma 5))
(println (soma5 6))

; Curryng 08
(defn texto [texto]
  (fn [operacao]
    (case operacao
      "maiuscula" (clojure.string/upper-case texto)
      "inverte" (reverse texto))))
(println ((texto "clojure") "maiuscula"))
(println ((texto "clojure") "inverte"))

