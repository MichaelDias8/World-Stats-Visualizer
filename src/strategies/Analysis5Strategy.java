package strategies;

/**
 * 5th concrete strategy class 
 * @author 	Michael
 */
public class Analysis5Strategy extends Strategy {
	/**
	 * retrieves performs an algorithm on the requested set of data and returns that data
	 * @param startYear	the first year in the range of years to retrieve data for 
	 * @param endYear	the last year in the range of years to retrieve data for 
	 * @param country	the country to retrieve the data for
	 * @return	the computed set of data
	 */
	@Override
	public double[][] doAlgorithm(int startYear, int endYear, String country) {
		double[][] data = new double[3][];
		int[] temp;
		temp = Reader.retrieve(startYear, endYear, country, "SE.XPD.TOTL.GD.ZS");
		int totalAcrossYears = 0;
		data[0] = new double[2];
		for(int i = 0; i < temp.length; i++) 
			totalAcrossYears += temp[i];
		data[0][0] = totalAcrossYears/(endYear - startYear + 1);
		data[0][1] = 1 - (totalAcrossYears/(endYear - startYear + 1));
		
		return data;
	}
}
