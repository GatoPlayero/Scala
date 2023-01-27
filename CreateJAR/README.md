# Create JAR with Scala & Execute on Azure Databricks

> <i>by Alberto Cesar <gato.playero@proton.me></i>

<hr>

## Table of Contents
1. **[Configure Databricks Cluster](#ConfigureDatabricksCluster)**
2. **[Install JDK](#Install-JDK)**
3. **[Install Conda](#Install-Conda)**
4. **[Uninstall Anaconda](#Uninstall-Anaconda)**
5. **[Install WinUtils](#Install-WinUtils)**
6. **[Create Virtual Environment on Conda](Create-Virtual-Environment-on-Conda)**

<hr>

## <font style="Color:blue;">Configure&nbsp;Databricks&#160;Cluster</font>

I’ll go directly to the development without entering into the Databricks setup and configuration on Azure, you could find more information on:

- https://docs.microsoft.com/en-us/azure/storage/blobs/data-lake-storage-use-databricks-spark
- https://docs.microsoft.com/en-us/azure/storage/blobs/data-lake-storage-quickstart-create-databricks-account
- https://docs.microsoft.com/en-us/azure/databricks/getting-started/try-databricks
- https://docs.microsoft.com/en-us/azure/azure-databricks/

## <font style="Color:blue;">Install JDK</font>

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

| ![alt text](./resources/images/006.png "006") |  ![alt text](./resources/images/007.png "007")  |
|	-----	|	-----	|
|	![alt text](./resources/images/008.png "008")	|	![alt text](./resources/images/009.png "009")	|


Don’t forget disable the automatic updates:

![alt text](./resources/images/010.png "010")

## <font style="Color:blue;">Install Conda</font>

You could install anaconda distribution from [https://repo.anaconda.com/archive/Anaconda3-2022.10-Windows-x86_64.exe](https://repo.anaconda.com/archive/Anaconda3-2022.10-Windows-x86_64.exe):

![alt text](./resources/images/011.png "011")

Install on [```C:\Anaconda3\```] folder:

| ![alt text](./resources/images/012.png "012") |  ![alt text](./resources/images/013.png "013")  |
|	-----	|	-----	|

## <font style="Color:blue;">Uninstall Anaconda</font>

To uninstall Anaconda, you can do a simple remove of the program. This will leave a few files behind, which for most users is just fine. See [**Option A**](#-option-a---use-simple-remove-to-uninstall-anaconda).

### • **Option A** - Use simple remove to uninstall Anaconda:

* Windows–In the Control Panel, choose Add or Remove Programs or Uninstall a program, and then select Python 3.*n* (*Anaconda*) or your version of Python.

* Use Uninstall-Anaconda.exe in [```C:\Users\username\Anaconda3```]

* [... also solutions for Mac and Linux are provided here: [https://docs.anaconda.com/anaconda/install/uninstall/](https://docs.anaconda.com/anaconda/install/uninstall/) ]

### • **Option B** - Full uninstall using ```Anaconda-Clean``` and simple remove. **NOTE:** Anaconda-Clean must be run before simple remove.

* Install the Anaconda-Clean package from Anaconda Prompt (*Terminal on Linux or macOS*):

* ```conda install anaconda-clean```

* In the same window, run one of these commands:

	* Remove all Anaconda-related files and directories with a confirmation prompt before deleting each one:

	* ```anaconda-clean``` 

	* Or, remove all Anaconda-related files and directories without being prompted to delete each one:

	* ```anaconda-clean –yes```

* *Anaconda-Clean* creates a backup of all files and directories that might be removed in a folder named ```.anaconda_backup``` in your home directory. Also note that *Anaconda-Clean* leaves your data files in the *AnacondaProjects* directory untouched.

* After using *Anaconda-Clean*, follow the instructions above in [**Option A**](#-option-a---use-simple-remove-to-uninstall-anaconda) to uninstall Anaconda.

## <font style="Color:blue;">Install WinUtils</font>

You could install [WinUtils](https://github.com/steveloughran/winutils) using next PowerShell script (*as administrator*):

```powershell
cd \;
mkdir “hadoop”;
New-Item -Path "C:\hadoop\bin" -ItemType Directory -Force;
Invoke-WebRequest -Uri https://github.com/steveloughran/winutils/blob/master/hadoop-3.0.0/bin/winutils.exe -OutFile "C:\hadoop\bin\winutils.exe";
[Environment]::SetEnvironmentVariable("HADOOP_HOME", "C:\hadoop", "Machine");
```

![alt text](./resources/images/014.png "014")

## <font style="Color:blue;">Create Virtual Environment on Conda</font>

I recommend you create a separated Virtual Environment on conda to setup your installations and configurations, you could find additional information on:

[https://docs.conda.io/projects/conda/en/latest/user-guide/concepts/environments.html](https://docs.conda.io/projects/conda/en/latest/user-guide/concepts/environments.html)
[https://docs.conda.io/projects/conda/en/latest/user-guide/tasks/manage-environments.html](https://docs.conda.io/projects/conda/en/latest/user-guide/tasks/manage-environments.html)


