# apache-flink-learn

APACHE FLINK README.TXT
#start flink:  bin/start-cluster.sh
#run a job: ./bin/flink run -c {fully_qualified_class_name} {base_folder_path}/target/apache-flink-recon-1.0-SNAPSHOT.jar
# -c argument provides fully qualified name of main class in the given target folder


Failed to execute goal org.apache.maven.plugins:maven-checkstyle-plugin:2.17:check (validate) on project apache-flink-recon: Failed during checkstyle execution: Unable to find suppressions file at location: /tools/maven/suppressions.xml: Could not find resource '/tools/maven/suppressions.xml'. -> [Help 1]
Solution:
mvn -Dcheckstyle.skip install

