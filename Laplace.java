package laplace;
import org.apache.commons.math3.distribution.LaplaceDistribution;
public class Laplace {

	public static void main(String[] args) {
		double laplaceMechanismCount(long realCountResult, double epsilon) {
			LaplaceDistribution ld = new LaplaceDistribution(0, 1 / epsilon);
			double noise = ld.sample();
			return realCountResult + noise;
		}
		
	}

}
