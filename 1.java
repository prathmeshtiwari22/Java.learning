import java.util.Scanner;

class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String pakageType;
    private int price;
    private boolean flightFacility;

    // Constructor
    public TravelAgencies(int regNo, String agencyName, String pakageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.pakageType = pakageType;
        this.price = price;
        this.flightFacility = flightFacility;   // ❗ fixed
    }

    // Getters and Setters
    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }

    public String getPakageType() {
        return pakageType;
    }

    public void setPakageType(String pakageType) {
        this.pakageType = pakageType;
    }
}

class Solution {

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) {
        int maxPrice = agencies[0].getPrice();

        for (int i = 1; i < agencies.length; i++) {
            if (agencies[i].getPrice() > maxPrice) {
                maxPrice = agencies[i].getPrice();
            }
        }
        return maxPrice;
    }

    public static TravelAgencies agencyDetailsForGivenIdAndType(
            TravelAgencies[] agencies, int regNo, String packageType) {

        for (TravelAgencies agency : agencies) {
            if (agency.isFlightFacility() &&
                agency.getRegNo() == regNo &&
                agency.getPakageType().equalsIgnoreCase(packageType)) {

                return agency;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TravelAgencies[] agencies = new TravelAgencies[4];

        for (int i = 0; i < 4; i++) {
            int regNo = sc.nextInt();
            sc.nextLine();
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = sc.nextInt();
            boolean flightFacility = sc.nextBoolean();

            agencies[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
        }

        int searchRegNo = sc.nextInt();
        sc.nextLine();
        String searchPackageType = sc.nextLine();

        int highestPrice = findAgencyWithHighestPackagePrice(agencies);
        System.out.println(highestPrice);

        TravelAgencies result =
                agencyDetailsForGivenIdAndType(agencies, searchRegNo, searchPackageType);

        if (result != null) {
            System.out.println(result.getAgencyName() + ":" + result.getPrice());
        }

        sc.close();
    }
}
