package SessionManager;

import java.util.HashMap;
import java.util.Map;

public class SessionManager {

    public static SessionManager instance;
    public Map<String, Object> sessionVariables;

    public SessionManager() {
        sessionVariables = new HashMap<>();
    }

    public synchronized SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void setSessionVariable(String key, Object value) {
        sessionVariables.put(key, value);
    }

    public Object getSessionVariable(String key) {
        return sessionVariables.get(key);
    }

    public void removeSessionVariable(String key) {
        sessionVariables.remove(key);
    }

}
