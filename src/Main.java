begin Class

SalesTaxCalculator {
    main(String[] args ) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the pruchase price: ");
    double purchasePrice = scanner.nextDouble();

    double salesTax = 0.05 * purchasePrice;

    System.out.println("Purchase Price: $" + purchasePrice);
    System.out.println("Sales Tax (5%): $" + salesTax);

    scanner.close();
        
    }
}