package maratonajava.javacore.aula38_designpatters.test;

import maratonajava.javacore.aula38_designpatters.domain.*;

public class DataTransferObjectTest {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = new Person.PersonBuilder()
                .firstName("William")
                .lastName("Suane")
                .build();
        ReportDTO reportDto = ReportDTO.ReportDTOBuilder.
                builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);
    }
}
