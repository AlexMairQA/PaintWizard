package paintWizard;

import java.util.Arrays;
import java.util.List;
import java.text.DecimalFormat;

public class BestPaintJob {

	private static List<Paint>paints=Arrays.asList(new Paint(19.99, "CheapoMax", 10, 21), new Paint(34.38, "ThatOneWithTheDog", 12, 41), new Paint(17.99, "AverageJoes", 11, 16), new Paint(25, "DuluxorousPaints", 22, 10));
	private static DecimalFormat df=new DecimalFormat("0.00");

	
public static void addPaintCan(Paint paint)
{
	paints.add(paint);
}
public static String computeBestPaint(double L, double H, double W) {
	
	double roomInSquarMeters=(L*H+L*W)*2;
	
	for (Paint paint : paints) {
	
		paint.calculateNoOfCans(roomInSquarMeters);
	}
	double maxTotal=0, currentTotal=0, minTotal=0;
	String paintBrand="";
	for (int i = 0; i < paints.size(); i++) {
		currentTotal=paints.get(i).getTotalPrice();
		if(currentTotal>maxTotal)
			maxTotal=currentTotal;
	}
	
	minTotal=maxTotal;
	for (int i = 0; i < paints.size(); i++) {
		currentTotal=paints.get(i).getTotalPrice();
		if(currentTotal<minTotal)
			minTotal=currentTotal;
	}
	
	for (Paint paint : paints) {
		if(paint.getTotalPrice()==minTotal)
			paintBrand=paint.getBrand();
	}
	
	return String.format("For a room of %1$sm^2, %2$s is the cheapest option at £%3$s", df.format(roomInSquarMeters), paintBrand, currentTotal);
}
	
	
}
