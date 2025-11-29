
# ContainerCPUUsage

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **totalUsage** | **kotlin.Int** | Total CPU time consumed in nanoseconds (Linux) or 100&#39;s of nanoseconds (Windows).  |  [optional] |
| **percpuUsage** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;** | Total CPU time (in nanoseconds) consumed per core (Linux).  This field is Linux-specific when using cgroups v1. It is omitted when using cgroups v2 and Windows containers.  |  [optional] |
| **usageInKernelmode** | **kotlin.Int** | Time (in nanoseconds) spent by tasks of the cgroup in kernel mode (Linux), or time spent (in 100&#39;s of nanoseconds) by all container processes in kernel mode (Windows).  Not populated for Windows containers using Hyper-V isolation.  |  [optional] |
| **usageInUsermode** | **kotlin.Int** | Time (in nanoseconds) spent by tasks of the cgroup in user mode (Linux), or time spent (in 100&#39;s of nanoseconds) by all container processes in kernel mode (Windows).  Not populated for Windows containers using Hyper-V isolation.  |  [optional] |



