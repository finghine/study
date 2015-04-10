package wit.fcl.sort;

public class StrategyMgr {

	ISort strategy = null;

	public StrategyMgr() {
	}

	public StrategyMgr(ISort strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(ISort strategy) {
		this.strategy = strategy;
	}

	public void sort(int[] array) {
		strategy.sort(array);
	}
}
