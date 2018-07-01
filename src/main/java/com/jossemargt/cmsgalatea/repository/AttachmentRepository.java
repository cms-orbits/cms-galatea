package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.Attachment;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = AttachmentRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Attachment.class)
public interface AttachmentRepository extends ReadOnlyRepository<Attachment, Long>, AttachmentRepositoryCustom {
}
