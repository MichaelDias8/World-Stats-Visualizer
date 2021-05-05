package strategies;
/**
 * 6th concrete strategy class 
 * @author 	Michael
 */
public class Analysis6Strategy extends Strategy {
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
		int[][] temp = new int[3][];
		temp[0] = Reader.retrieve(startYear, endYear, country, "SH.MED.BEDS.ZS");
		temp[1] = Reader.retrieve(startYear, endYear, country, "SH.XPD.CHEX.PC.CD");
		data[0] = new double[temp[0].length];
		data[1] = new double[temp[1].length];
		for(int i = 0; i < temp[0].length; i++) {
			if(temp[1][i] != 0)
				data[0][i] = (double)temp[0][i]/(temp[1][i] * 1000);
			else 
				data[0][i] = 0;
		}		
		return data;
	}
}
