object P02{

    def penultimate[A](l: List[A]): A = l match{
        case h :: _ :: Nil => h
        case _ :: xs => penultimate(xs)
        case _ => throw new NoSuchElementException
    }

}
