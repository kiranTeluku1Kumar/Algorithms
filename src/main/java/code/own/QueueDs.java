package code.own;

public class QueueDs {
	private int[] lineQueues;
	private int dynaSize = 10;
	private int currentPointer;
	private int lastPosition;

	public QueueDs() {
		lineQueues = new int[dynaSize];
	}

	/**
	 * 
	 * @param numberToEnqueue
	 */
	public void addToQueue(int numberToEnqueue) {
		if(tellMeSize() -1 >= -1) {
			dynaSize++;
			lineQueues[currentPointer] = numberToEnqueue;
			currentPointer++;
		}
	}
	
	public int[] getAllQueueElements() {
		return lineQueues;
	}

	public int tellMeSize() {
		return dynaSize;
	}

}
