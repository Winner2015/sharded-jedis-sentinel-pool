package test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.AbstractPipeline;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.PipelineHelper;
import java.util.stream.ReduceOps;
import java.util.stream.Sink;
import java.util.stream.Stream;
import java.util.stream.StreamOpFlag;
import java.util.stream.StreamShape;
import java.util.stream.TerminalOp;
import java.util.stream.ReduceOps.AccumulatingSink;
import java.util.stream.ReduceOps.Box;
import java.util.stream.ReduceOps.ReduceOp;
import java.util.stream.ReduceOps.ReduceTask;
import java.util.stream.ReferencePipeline.StatelessOp;

public class Test2 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("China", "America", "Russia", "Britain");
		List<String> result = list.stream()
				.parallel()
				.filter(e -> e.length() >= 4)
				.map(e -> e.charAt(0))
				.map(e -> String.valueOf(e))
				.collect(Collectors.toList());
	}
}


	public static <T> Stream<T> stream(Spliterator<T> spliterator, boolean parallel) {
		Objects.requireNonNull(spliterator);

		// 返回了一个由Head实现的Stream，三个参数分别代表流的数据源、特性组合、是否并行
		return new ReferencePipeline.Head<>(spliterator, StreamOpFlag.fromCharacteristics(spliterator), parallel);
	}

AbstractPipeline(Spliterator<?> source,
        int sourceFlags, boolean parallel) {
this.previousStage = null;  //上一个stage指向null
this.sourceSpliterator = source;
this.sourceStage = this;  //源头stage指向自己
this.sourceOrOpFlags = sourceFlags & StreamOpFlag.STREAM_MASK;
// The following is an optimization of:
// StreamOpFlag.combineOpFlags(sourceOrOpFlags, StreamOpFlag.INITIAL_OPS_VALUE);
this.combinedFlags = (~(sourceOrOpFlags << 1)) & StreamOpFlag.INITIAL_OPS_VALUE;
this.depth = 0;
this.parallel = parallel;
}


