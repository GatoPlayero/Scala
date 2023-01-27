# Create JAR with Scala & Execute on Azure Databricks

> <i>by Alberto Cesar <gato.playero@proton.me></i>

<hr>

## Table of Contents
1. **[Configure Databricks Cluster](#Configure&nbsp;Databricks&nbsp;Cluster)**
2. **[Install JDK](#Install_JDK)**
3. **[Install Conda](#Install&#160;Conda)**

<hr>

&#160;1&nbsp;2&#160;

## <font style="Color:blue;">Configure Databricks Cluster</font>

I’ll go directly to the development without entering into the Databricks setup and configuration on Azure, you could find more information on:

- https://docs.microsoft.com/en-us/azure/storage/blobs/data-lake-storage-use-databricks-spark
- https://docs.microsoft.com/en-us/azure/storage/blobs/data-lake-storage-quickstart-create-databricks-account
- https://docs.microsoft.com/en-us/azure/databricks/getting-started/try-databricks
- https://docs.microsoft.com/en-us/azure/azure-databricks/

## <font style="Color:blue;">Install_JDK</font>

Download JDK from [https://www.oracle.com/java/technologies/javase-jdk8-downloads.html](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html), is required to work on JDK Version 8

<!-- <img src="./resources/images/001.png" width="100%" /> -->
![alt text](./resources/images/001.png "001")

Install JAVA on [```C:\JAVA\```] folder:

![alt text](./resources/images/002.png "002")

You should install JRE on a separated folder:

![alt text](./resources/images/003.png "003")

You should be able to review if installed correctly through command prompt using “```java -version```”:

![alt text](./resources/images/004.png "004")

Once installed, you should configure the global “```JAVA_HOME```” environment variable, you could do it on PowerShell (*as administrator*):


```powershell applyLineNumbers
[Environment]::SetEnvironmentVariable("JAVA_HOME", "C:\JAVA", "Machine")
```

![alt text](./resources/images/005.png "005")

Once added, you could add path environment (```%JAVA_HOME%\bin```):

|	![alt text](./resources/images/006.png "006")	|	![alt text](./resources/images/007.png "007")	|

|	![alt text](./resources/images/008.png "008")	|	![alt text](./resources/images/009.png "009")	|

Don’t forget disable the automatic updates:

![alt text](./resources/images/010.png "010")

## <font style="Color:blue;">Install Conda</font>

You could install anaconda distribution from [https://repo.anaconda.com/archive/Anaconda3-2022.10-Windows-x86_64.exe(https://repo.anaconda.com/archive/Anaconda3-2022.10-Windows-x86_64.exe]:

![alt text](./resources/images/011.png "011")