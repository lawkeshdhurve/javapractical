import java.util.Arrays;

 class sequencenuminrange {
    public static void main(String[] args) {
        int countvalid = 0;
        int countinvalid = 0;
        String arr[] = {"2022bit005","2021bcs005","2020bce005","2020bme005","2023bpr005","2023ben005"};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (isValidRegistration(arr[i])) {
                countvalid++;
            } else {
                countinvalid++;
            }
        }

        System.out.println(countvalid);
       
    }

    private static boolean isValidRegistration(String regNumber) {
        if (regNumber.length() != 10) {
            return false;
        }

        String yearPart = regNumber.substring(0, 4);
        String deptPart = regNumber.substring(4, 7);
        String numPart = regNumber.substring(7, 10);

        return isValidYear(yearPart) && isValidDepartment(deptPart) && isValidNum(numPart);
    }

    private static boolean isValidYear(String yearPart) {
        try {
            int year = Integer.parseInt(yearPart);
            return year >= 2000 && year <= 2025;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isValidDepartment(String deptPart) {
        return deptPart.equals("bit") || deptPart.equals("bcs") || deptPart.equals("bce") || deptPart.equals("bme");
    }
    
    private static boolean isValidNum(String numPart){
    try {
    int num = Integer.parseInt(numPart);
    return num>=0 && num<=50;
    } catch(NumberFormatException e){
    return false;
    }
}
}

