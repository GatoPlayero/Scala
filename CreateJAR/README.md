# Create JAR with Scala & Execute on Azure Databricks

> <i>by Alberto Cesar <gato.playero@proton.me></i>

<hr>

## Table of Contents
1. **[Configure Databricks Cluster](##Configure_Databricks_Cluster)**
2. **[Install JDK](##Install_JDK)**
3. [Third Example](#tbd)

<hr>

## <font style="Color:blue;">Configure_Databricks_Cluster</font>

I’ll go directly to the development without entering into the Databricks setup and configuration on Azure, you could find more information on:

- https://docs.microsoft.com/en-us/azure/storage/blobs/data-lake-storage-use-databricks-spark
- https://docs.microsoft.com/en-us/azure/storage/blobs/data-lake-storage-quickstart-create-databricks-account
- https://docs.microsoft.com/en-us/azure/databricks/getting-started/try-databricks
- https://docs.microsoft.com/en-us/azure/azure-databricks/

## <font style="Color:blue;">Install_JDK</font>

Download JDK from [https://www.oracle.com/java/technologies/javase-jdk8-downloads.html](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html), is required to work on JDK Version 8

<img src="./resources/images/001.png" width="100%" />

Install JAVA on [```C:\JAVA\```] folder:

<img src="./resources/images/002.png" width="70%" />

You should install JRE on a separated folder:

<img src="./resources/images/003.png" width="50%" />

You should be able to review if installed correctly through command prompt using “```java -version```”:

<img src="./resources/images/004.png" width="50%" />

Once installed, you should configure the global “```JAVA_HOME```” environment variable, you could do it on PowerShell (*as administrator*):

```powershell applyLineNumbers
[Environment]::SetEnvironmentVariable("JAVA_HOME", "C:\JAVA", "Machine")
```


```{javascript, attr.source='.numberLines startFrom="3"'}
// @todo Add 8+ lines of amazing javascript code
printf();
printf();
printf();
printf();
printf();
printf();
printf();
printf();
```

```javascript showLineNumbers highlightLine=2-5,8
// @todo Add 8+ lines of amazing javascript code
printf();
printf();
printf();
printf();
printf();
printf();
printf();
printf();
```

<img src="./resources/images/005.png" width="100%" />