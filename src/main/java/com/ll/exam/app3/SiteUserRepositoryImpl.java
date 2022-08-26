package com.ll.exam.app3;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import static com.ll.exam.app3.QSiteUser.siteUser;

@RequiredArgsConstructor
public class SiteUserRepositoryImpl implements SiteUserRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public SiteUser getQslUser(Long id) {
        return jpaQueryFactory.selectFrom(siteUser)
                .where(siteUser.id.eq(id))
                .fetchOne();
    }

}
