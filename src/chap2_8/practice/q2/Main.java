package chap2_8.practice.q2;

import chap1_5.library.Book;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {

        Destination paris = new Destination("Paris", "France");
        Destination rome = new Destination("Rome", "Italy");
        Destination berlin = new Destination("Berlin", "Germany");

        Traveler alice = new Traveler("Alice", "alice@example.com");
        Traveler bob = new Traveler("Bob", "bob@example.com");
        Traveler charlie = new Traveler("Charlie", "charlie@example.com");

        List<Booking> bookings = List.of(
                new Booking(alice, paris, 2022, 2000),
                new Booking(bob, rome, 2021, 1500),
                new Booking(alice, berlin, 2023, 1800),
                new Booking(charlie, paris, 2022, 2200),
                new Booking(bob, paris, 2021, 2500)
        );


        // 연습 1: 2022년에 예약된 모든 여행을 찾아 가격 오름차 정렬.
        List<Booking> booking2022 = bookings.stream()
                .filter(bk -> bk.getYear() == 2022)
                .sorted(comparing(Booking::getPrice))
                .collect(toList());
        booking2022.forEach(System.out::println);
        System.out.println("=====================");
        // 연습 2: 여행지가 있는 모든 나라 이름을 중복 없이 나열하시오.
        List<Destination> travelDistinct = bookings.stream()
                .map(bk -> bk.getDestination())
                .distinct()
                .collect(toList());
        System.out.println(travelDistinct);
        System.out.println("=====================");
        // 연습 3: Paris에 예약된 모든 여행자를 찾아 이름순으로 오름차 정렬.
        List<Traveler> parisPeople = bookings.stream()
                .filter(bk -> bk.getDestination().getCity().equals("Paris"))
                .map(bk -> bk.getTraveler())
                .sorted(comparing(Traveler::getName))
                .collect(toList());
        parisPeople.forEach(System.out::println);
        System.out.println("=====================");
        // 연습 4: 모든 여행자의 이메일을 리스트에 모아서 알파벳순으로 오름차정렬하여 반환.
        List<String> travelerList = bookings.stream()
                .map(bk -> bk.getTraveler().getEmail())
                .sorted()
                .collect(toList());
        travelerList.forEach(System.out::println);
        System.out.println("=====================");
        // 연습 5: Italy로의 여행이 한 건이라도 있는지 여부 확인.
        boolean italy = bookings.stream()
                .anyMatch(bk -> bk.getDestination().getCountry().equals("Italy"));
        System.out.println("italy = " + italy);
        // 연습 6: France로의 모든 여행의 총 가격을 출력.
        double total = bookings.stream()
                .filter(bk -> bk.getDestination().getCity().equals("Paris"))
                .mapToDouble(bk -> bk.getPrice())
                .sum();
         System.out.println("total = " + total);

        // 연습 7: 예약된 모든 여행에서 최고 가격은 얼마인가?
        double maxPrice = bookings.stream()
                .mapToDouble(bk -> bk.getPrice())
                .max()
                .orElse(0);
        System.out.println("maxPrice = " + maxPrice);


        // 연습 8: 가장 저렴한 여행의 정보 탐색.
        double minPrice = bookings.stream()
                .mapToDouble(bk -> bk.getPrice())
                .min()
                .orElse(0);
        System.out.println("minPrice = " + minPrice);
                

        // 연습 9: 가격이 2000 이상인 모든 여행 예약 정보를 출력.
        List<Traveler> allTravel = bookings.stream()
                .filter(bk -> bk.getPrice() >= 2000)
                .map(bk -> bk.getTraveler())
                .collect(toList());
                allTravel.forEach(System.out::println);

        // 연습 10: 모든 예약에서 가장 낮은 가격보다 높은 가격을 가진 예약의 평균 가격을 계산하시오.
        double average = bookings.stream()
                .filter(bk -> bk.getPrice() > minPrice)
                .mapToDouble(bk -> bk.getPrice())
                .average()
                .orElse(0);
        System.out.println("average = " + average);


        // 연습 11: 모든 여행자의 여행 예약을 여행지별로 그룹화하여 출력하시오.
        HashMap<String, List<Booking>> cities = new HashMap<>();

        List<Booking> city1 = bookings.stream()
                .filter(bk -> bk.getDestination().getCity().equals("Paris"))
                .collect(toList());
        List<Booking> city2 = bookings.stream()
                .filter(bk -> bk.getDestination().getCity().equals("Rome"))
                .collect(toList());
        List<Booking> city3 = bookings.stream()
                .filter(bk -> bk.getDestination().getCity().equals("Berlin"))
                .collect(toList());

        cities.put("파리",city1);
        cities.put("로마",city2);
        cities.put("베를린",city3);

        for (String city : cities.keySet()) {
            System.out.println("city = " + city);
            List<Booking> cts = cities.get(city);
            for (Booking ct : cts) {
                System.out.println(ct);
            }

        }
    }


}