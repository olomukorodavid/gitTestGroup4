package _11_good_code_etiquette;

public class Tool {
	static final int tierOne = 1;
	static final int tierTwo = 2;
	static final int tierThree = 3;
	static final double tierOneMultiplier = 1.05;
	static final double tierTwoMultiplier = 1.10;
	static final double tierThreeMultiplier = 1.15;
	public static double calculate(double account, int tier) {
        if (tier == tierOne) {
            return account * tierOneMultiplier;
        } else if (tier == tierTwo) {
            return account * tierTwoMultiplier;
        } else if (tier == tierThree) {
            return account * tierThreeMultiplier;
        } else {
            return account;
        }
    }
}
