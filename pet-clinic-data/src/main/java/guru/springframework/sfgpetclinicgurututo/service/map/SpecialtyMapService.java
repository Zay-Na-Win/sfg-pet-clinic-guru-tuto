package guru.springframework.sfgpetclinicgurututo.service.map;

import guru.springframework.sfgpetclinicgurututo.model.Specialty;
import guru.springframework.sfgpetclinicgurututo.service.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtiesService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return null;
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
