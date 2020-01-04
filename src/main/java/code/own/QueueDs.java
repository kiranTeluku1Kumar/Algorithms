package code.own;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
		if(tellMeSize() == currentPointer) {
			swapElements();
		}
		addToCurrent(numberToEnqueue);
	}

	private void addToCurrent(int numberToEnqueue) {
		this.lineQueues[currentPointer] = numberToEnqueue;
		currentPointer++;
	}
	
	private void swapElements() {
		int[] tempArray = this.lineQueues.clone();
		int currLength = this.lineQueues.length;
		int newSize = currLength + dynaSize;
		this.lineQueues = new int[newSize];
		IntStream.range(0, currLength).forEach(e -> resizeWithNewValues(tempArray, e));
	}

	private void resizeWithNewValues(int[] tempArray, int e) {
		this.lineQueues[e] = tempArray[e];
	}

	public int[] getAllQueueElements() {
		return lineQueues;
	}

	public int tellMeSize() {
		return lineQueues.length;
	}
	
}
