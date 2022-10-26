package hui.service.impl;

import hui.dao.PasswordDao;
import hui.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    private PasswordDao passwordDao;

    @Override
    public boolean openUrl(String url, String password) {
        return passwordDao.verify(url, password);
    }
}
