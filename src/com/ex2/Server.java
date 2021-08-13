package com.ex2;

/*Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final, mostrar a etiqueta de preço
de cada produto na mesma ordem em que foram digitados.

Todo produto possui nome preço. Produtos importados possuem uma taxa de alfandega, e produtos usados possuem
 data de fabricação. Estes dadps específicos devem ser acrescentados na etiqueta de preço conforme exemplo (próx página)
 Para produtos importados, a taxa de alfândega deve ser acrescentada ao preço final do produto.

 Enter the number of products: 3
 Product #1 data:
 Common, used or imported (c/u/i)? i
 Name: Tablet
 Price: 260.00
 Customs fee: 20.00
 Product #2 data:
 Common, used or imported (c/u/i)? c
 Name: Notebook
 Price: 1100.00
 Product #3 data:
 Common, used or imported (c/u/i)? u
 Name: Iphone
 Price: 400.00
 Manufacture date (DD/MM/YYYY): 15/03/2017

 PRICE TAGS:
 Tablet $ 280.00 (Customs fee: $ 20.00)
 Notebook $ 1100.00
 Manufacture date (DD/MM/YYYY): 15/03/2017
 */

import com.ex2.entities.ImportedProduct;
import com.ex2.entities.Product;
import com.ex2.entities.UsedProduct;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Server {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Product> ProductList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Product #"+i+" data:");
            char type = 'a';
            while (type != 'c' & type != 'u' & type != 'i'){
                System.out.print("Common, used or imported (c/u/i)? ");
                type = scanner.next().charAt(0);
            }
            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            if (type == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                ProductList.add(new ImportedProduct(name, price, customsFee));
            } else if (type == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String st = scanner.next();
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date manufactureDate = df.parse(st);
                ProductList.add(new UsedProduct(name, price, manufactureDate));
            } else {
                ProductList.add(new Product(name, price));
            }

        }

        System.out.println();
        System.out.println("PRICE TAGS:");

        for (Product product : ProductList){
            System.out.println(product.priceTag());
        }

        scanner.close();
    }
}