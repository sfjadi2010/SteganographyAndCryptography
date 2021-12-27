fun solution(products: List<String>, product: String) {
    // put your code here
    print(products.indices.filter { products[it] == product }.joinToString(" "))
}