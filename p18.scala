object P18 {
    def slice99[A](i: Int, j: Int, ls: List[A]): List[A] = {
        ls.slice(i, j)
    }

    def sliceFunctional[A](i: Int, j: Int, ls: List[A]): List[A] = {
        ls drop i take (j - (i max 0))
    }
}
