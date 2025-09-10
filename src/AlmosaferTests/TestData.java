package AlmosaferTests;

import java.time.LocalDate;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestData {
	// WebDriver instance for browser automation
	WebDriver driver = new ChromeDriver();

	// or use this website
	// https://kw.almosafer.com/en?destination=&destinationiata=&origin=&originiata=&ncr=1&sem=1&title=&subtitle=Book+with+Almosafer+to+Get+the+Best+Discounts+and+Deals+Online&utm_source=google&utm_medium=cpc&utm_term=AM-SEM-KWI-Brand-English&utm_content=149575914202&utm_campaign=19957705437&gad_source=1&gad_campaignid=19957705437&gbraid=0AAAAADN9nx-qha0YqS3_CA-kaoOyCRK0i&gclid=Cj0KCQjww4TGBhCKARIsAFLXndQCZKunw6mI0ubIoapXRxnGe8V1dhXPAqM06YbOgnrcK-jLMjqjtpYaAjewEALw_wcB
	String URL = "https://www.almosafer.com/en"; // The URL of the website being tested
	Random random = new Random(); // Random number generator for random test data
	int randomIndex = random.nextInt(); // Random index for various selections

	// Test 1: Expected language is English
	String ExpectedLang = "en";

	// Test 2: Expected contact number
	String ExpectedNum = "+966554400000";

	// Test 3: Expected currency is SAR
	String ExpectedCurrency = "SAR";

	// Test 5: Expected value for the hotel tab not selected
	String ExpectedValue = "false";

	// Test 6: Expected departure date, which is tomorrow
	int Tomorrow = LocalDate.now().plusDays(1).getDayOfMonth();
	String ExpectedDeparture = String.format("%01d", Tomorrow);

	// Test 7: Expected return date, which is the day after tomorrow
	int DayAfterTomorrow = LocalDate.now().plusDays(2).getDayOfMonth();
	String ExpectedReturn = String.format("%02d", DayAfterTomorrow);

	// Test 9: Random city selection in English
	String[] EnglishCities = { "Dubbai", "Jeddah", "riyadh" };
	int randomEnglishCity = random.nextInt(EnglishCities.length);
	String randomEn = EnglishCities[randomEnglishCity];

	// Test 9: Random city selection in Arabic
	String[] ArabicCities = { "دبي", "جدة" };
	int randomArabicCity = random.nextInt(ArabicCities.length);
	String randomAr = ArabicCities[randomArabicCity];

	public class CitiesData {

		private static String[] EnglishCities = { "Dubbai", "Jeddah", "Riyadh" };
		private static String[] ArabicCities = { "دبي", "جدة" };
		private static Random random = new Random();

		public static String getRandomCity(String lang) {
			if (lang.equalsIgnoreCase("ar")) {
				return ArabicCities[random.nextInt(ArabicCities.length)];
			} else {
				return EnglishCities[random.nextInt(EnglishCities.length)];
			}
		}
	}

	// Test 12: Expected outcome after finishing hotel search
	boolean ExpectedFinshingSearchHotel = true;
}
