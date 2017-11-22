object P17{
    def splitNoob[A](n: Int, ls: List[A]): List[List[A]] = {
        List(ls.slice(0, n), ls.slice(n, ls.length))
    }

    def splitBuiltIn[A](n: Int, ls: List[A]): (List[A], List[A]) = {
        ls.splitAt(n)
    }

    def splitFunctional[A](n: Int, ls: List[A]): List[List[A]] = {
        List(ls.take(n), ls.drop(n))
    }
}
