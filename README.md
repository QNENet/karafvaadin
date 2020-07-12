# Karaf Vaadin 14
Project to investigate the usage of Vaadin Designer 4.5.7 in Compatability Mode in a Karaf OSGi container

Run Karaf as follows ===================================================================

paulf@paulf-X550LD ~/qneCustomKaraf/karaf $ bin/karaf debug clean
Listening for transport dt_socket at address: 5005

  Apache Karaf (4.3.0-SNAPSHOT)

Hit '<tab>' for a list of available commands
and '[cmd] --help' for help on a specific command.
Hit '<ctrl-d>' or type 'system:shutdown' or 'logout' to shutdown Karaf.

karaf@root()> feature:repo-add mvn:com.example.karafvaadin/karafvaadinfeatures/1.0.0-SNAPSHOT/xml/features
Adding feature url mvn:com.example.karafvaadin/karafvaadinfeatures/1.0.0-SNAPSHOT/xml/features
karaf@root()> feature:install website

Then browse ============================================================================
 
to localhost:8181
