;---
; Excerpted from "Mastering Clojure Macros",
; published by The Pragmatic Bookshelf.
; Copyrights apply to this code. It may not be used to create training material, 
; courses, books, articles, and the like. Contact us if you are in doubt.
; We make no guarantees that this code is fit for any purpose. 
; Visit http://www.pragmaticprogrammer.com/titles/cjclojure for more book information.
;---
;; when evaluated at the macro level:
(if (= 2 (+ 1 1))
  (do (print "You got")
      (print " the touch!")
      (println)))

;; and when later evaluated as code:
;You got the touch!
;=> nil
