public static void main(String[] args) {
    int year = Integer.parseInt(args[0]);
    String d = "f";
    String leap_year_result = leapyear(year);
    while (true) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            if (d == "m") {
                d = "w";
                int variable_3_27 = 1;
                int result_add_constant_0 = add_constant_0(year, variable_3_27);
                year = result_add_constant_0;
            } else if (d == "t") {
                d = "th";
                year += 1;
            } else if (d == "w") {
                d = "f";
                year += 1;
            } else if (d == "th") {
                d = "sa";
                year += 1;
            } else if (d == "f") {
                d = "s";
                year += 1;
            } else if (d == "sa") {
                d = "m";
                year += 1;
            } else if (d == "s") {
                d = "t";
                year += 1;
            }
        } else {
            if (d == "m") {
                d = "t";
                year += 1;
            } else if (d == "t") {
                d = "w";
                year += 1;
            } else if (d == "w") {
                d = "th";
                year += 1;
            } else if (d == "th") {
                d = "f";
                year += 1;
            } else if (d == "f") {
                d = "sa";
                year += 1;
            } else if (d == "sa") {
                d = "s";
                year += 1;
            } else if (d == "s") {
                d = "m";
                year += 1;
            }
        }
        if (d == "f" && leap_year_result == "ly" && leapyear(year) == "y") {
            break;
        } else if (d == "f" && leap_year_result == "nly" && leapyear(year) == "n") {
            break;
        }
    }
    System.out.println(year);
}