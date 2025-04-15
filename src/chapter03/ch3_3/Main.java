package chapter03.ch3_3;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        // 기능1: 상품추가
        cart.addProduct("양파", 3000);
        cart.addProduct("사과", 10000);
        cart.addProduct("생선", 12000);
        cart.addProduct("두부", 2000);

        // 기능2: 장바구니 목록 출력
        cart.printCart();

        // 기능3: 상품 삭제
        System.out.print("마늘 제거: ");
        cart.removeProduct("마늘");
        cart.printCart();

        System.out.println("사과 제거: ");
        cart.removeProduct("사과");
        cart.printCart();

        // 기능4: 총 가격 계산
        System.out.println(cart.calculateTotalPrice());
    }
}
