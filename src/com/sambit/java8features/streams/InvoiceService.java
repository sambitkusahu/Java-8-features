package com.sambit.java8features.streams;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceService {
    private List<Invoice> getInvoiceList() throws ParseException {
        List<Invoice> invoices = Arrays.asList(
                new Invoice(101, 496.67, "SQ078OPQ", new SimpleDateFormat("dd-MM-yyyy").parse("03-06-2020")),
                new Invoice(102, 229.75, "QJ098OJH", new SimpleDateFormat("dd-MM-yyyy").parse("02-06-2020")),
                new Invoice(103, 494.28, "RT048OQT", new SimpleDateFormat("dd-MM-yyyy").parse("01-06-2021")),
                new Invoice(103, 195.56, "SR048OPR", new SimpleDateFormat("dd-MM-yyyy").parse("28-05-2021")),
                new Invoice(103, 285.50, "JT048OTK", new SimpleDateFormat("dd-MM-yyyy").parse("25-05-2021"))
        );
        return invoices;
    }

    public static void main(String[] args) throws ParseException {
        InvoiceService service = new InvoiceService();
        List<Invoice> list = service.getInvoiceList();

        Comparator<Invoice> comparator = (c1, c2)->{
            return Long.valueOf(c1.getCreatedOn().getTime()).compareTo(c2.getCreatedOn().getTime());
        };

        //Using comparator we are sorting
       /* Collections.sort(list, comparator);
          list.forEach(System.out::println); */

        //Using method reference sort the list of items
       /* list.sort(Comparator.comparing(Invoice::getCreatedOn));
        list.forEach(System.out::println); */

        //Sort using Stream API
      /*  List<Invoice> sortedList = service.getInvoiceList().stream()
                .sorted(Comparator.comparing(Invoice::getCreatedOn))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println); */

        //Sort Uisng Stream API in Reverse Order

        List<Invoice> sortedList = service.getInvoiceList().stream()
                .sorted(Comparator.comparing(Invoice::getCreatedOn).reversed())
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);

    }
}
