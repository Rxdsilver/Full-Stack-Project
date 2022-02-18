package maven;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "keycloak.server")
public class KeycloakServerProperties {
    String contextPath = "/auth";
    String realmImportFile = "baeldung-realm.json";
    AdminUser adminUser = new AdminUser();

    public AdminUser getAdminUser() {
    	return this.adminUser;
    }
    public String getRealmImportFile() {
    	return this.realmImportFile;
    }
    public String getContextPath() {
    	return this.contextPath;
    }
    
    public static class AdminUser {
        public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		String username = "admin";
        String password = "admin";
      
    }
}