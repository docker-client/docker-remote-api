
# ServiceSpecUpdateConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parallelism** | **kotlin.Long** | Maximum number of tasks to be updated in one iteration (0 means unlimited parallelism).  |  [optional]
**delay** | **kotlin.Long** | Amount of time between updates, in nanoseconds. |  [optional]
**failureAction** | [**inline**](#FailureAction) | Action to take if an updated task fails to run, or stops running during the update.  |  [optional]
**monitor** | **kotlin.Long** | Amount of time to monitor each updated task for failures, in nanoseconds.  |  [optional]
**maxFailureRatio** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The fraction of tasks that may fail during an update before the failure action is invoked, specified as a floating point number between 0 and 1.  |  [optional]
**order** | [**inline**](#Order) | The order of operations when rolling out an updated task. Either the old task is shut down before the new task is started, or the new task is started before the old task is shut down.  |  [optional]


<a name="FailureAction"></a>
## Enum: FailureAction
Name | Value
---- | -----
failureAction | continue, pause, rollback


<a name="Order"></a>
## Enum: Order
Name | Value
---- | -----
order | stop-first, start-first



