# Java IoC Frameworks Benchmark

This is a short benchmark presenting the speed of different Java IoC containers. 

### How was the benchmak performed?

Each tested framework was to instantiate **10 000** **prototype** beans (*Base* class), each one with a **prototype** dependency injected (*SampleImpl* class).

![alt text](https://github.com/leszko/benchmark-ioc/raw/master/dependency.png)

### Results

![alt text](https://github.com/leszko/benchmark-ioc/raw/master/chart.png)

### Conclusion

The winner is **Dagger**, which is suitable for both: Android and Java. Its power is in annotation preprocessing during compile time. You can read more here: http://square.github.io/dagger/.
