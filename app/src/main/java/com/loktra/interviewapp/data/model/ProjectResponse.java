package com.loktra.interviewapp.data.model;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;

import java.util.List;

/**
 * Created by Ashif
 */
public class ProjectResponse {

    /**
     * sha : b9ecb5797b97ba557a70efd66d2ff2c22501723f
     * commit : {"author":{"name":"Vipul A M","email":"vipulnsward@gmail.com","date":"2017-09-06T12:56:44Z"},"committer":{"name":"GitHub","email":"noreply@github.com","date":"2017-09-06T12:56:44Z"},"message":"Merge pull request #30533 from ydakuka/fix-typo-fully-qualified\n\nfix type fully qualified [ci skip]","tree":{"sha":"6bf1bb5e06d7f12f13190c3c820fcd0ee61ffe25","url":"https://api.github.com/repos/rails/rails/git/trees/6bf1bb5e06d7f12f13190c3c820fcd0ee61ffe25"},"url":"https://api.github.com/repos/rails/rails/git/commits/b9ecb5797b97ba557a70efd66d2ff2c22501723f","comment_count":0}
     * url : https://api.github.com/repos/rails/rails/commits/b9ecb5797b97ba557a70efd66d2ff2c22501723f
     * html_url : https://github.com/rails/rails/commit/b9ecb5797b97ba557a70efd66d2ff2c22501723f
     * comments_url : https://api.github.com/repos/rails/rails/commits/b9ecb5797b97ba557a70efd66d2ff2c22501723f/comments
     * author : {"login":"vipulnsward","id":567626,"avatar_url":"https://avatars1.githubusercontent.com/u/567626?v=4","gravatar_id":"","url":"https://api.github.com/users/vipulnsward","html_url":"https://github.com/vipulnsward","followers_url":"https://api.github.com/users/vipulnsward/followers","following_url":"https://api.github.com/users/vipulnsward/following{/other_user}","gists_url":"https://api.github.com/users/vipulnsward/gists{/gist_id}","starred_url":"https://api.github.com/users/vipulnsward/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/vipulnsward/subscriptions","organizations_url":"https://api.github.com/users/vipulnsward/orgs","repos_url":"https://api.github.com/users/vipulnsward/repos","events_url":"https://api.github.com/users/vipulnsward/events{/privacy}","received_events_url":"https://api.github.com/users/vipulnsward/received_events","type":"User","site_admin":false}
     * committer : {"login":"web-flow","id":19864447,"avatar_url":"https://avatars3.githubusercontent.com/u/19864447?v=4","gravatar_id":"","url":"https://api.github.com/users/web-flow","html_url":"https://github.com/web-flow","followers_url":"https://api.github.com/users/web-flow/followers","following_url":"https://api.github.com/users/web-flow/following{/other_user}","gists_url":"https://api.github.com/users/web-flow/gists{/gist_id}","starred_url":"https://api.github.com/users/web-flow/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/web-flow/subscriptions","organizations_url":"https://api.github.com/users/web-flow/orgs","repos_url":"https://api.github.com/users/web-flow/repos","events_url":"https://api.github.com/users/web-flow/events{/privacy}","received_events_url":"https://api.github.com/users/web-flow/received_events","type":"User","site_admin":false}
     * parents : [{"sha":"18f342d82a380d5bd23c33018818224d32b69a95","url":"https://api.github.com/repos/rails/rails/commits/18f342d82a380d5bd23c33018818224d32b69a95","html_url":"https://github.com/rails/rails/commit/18f342d82a380d5bd23c33018818224d32b69a95"},{"sha":"56ac13e8e4549c680900eab14079881f5b2a38cf","url":"https://api.github.com/repos/rails/rails/commits/56ac13e8e4549c680900eab14079881f5b2a38cf","html_url":"https://github.com/rails/rails/commit/56ac13e8e4549c680900eab14079881f5b2a38cf"}]
     */

    private String sha;
    private CommitBean commit;
    private String url;
    private String html_url;
    private String comments_url;
    private AuthorBeanX author;
    private CommitterBeanX committer;
    private List<ParentsBean> parents;

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public CommitBean getCommit() {
        return commit;
    }

    public void setCommit(CommitBean commit) {
        this.commit = commit;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getComments_url() {
        return comments_url;
    }

    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    public AuthorBeanX getAuthor() {
        return author;
    }

    public void setAuthor(AuthorBeanX author) {
        this.author = author;
    }

    public CommitterBeanX getCommitter() {
        return committer;
    }

    public void setCommitter(CommitterBeanX committer) {
        this.committer = committer;
    }

    public List<ParentsBean> getParents() {
        return parents;
    }

    public void setParents(List<ParentsBean> parents) {
        this.parents = parents;
    }

    public static class CommitBean {
        /**
         * author : {"name":"Vipul A M","email":"vipulnsward@gmail.com","date":"2017-09-06T12:56:44Z"}
         * committer : {"name":"GitHub","email":"noreply@github.com","date":"2017-09-06T12:56:44Z"}
         * message : Merge pull request #30533 from ydakuka/fix-typo-fully-qualified

         fix type fully qualified [ci skip]
         * tree : {"sha":"6bf1bb5e06d7f12f13190c3c820fcd0ee61ffe25","url":"https://api.github.com/repos/rails/rails/git/trees/6bf1bb5e06d7f12f13190c3c820fcd0ee61ffe25"}
         * url : https://api.github.com/repos/rails/rails/git/commits/b9ecb5797b97ba557a70efd66d2ff2c22501723f
         * comment_count : 0
         */

        private AuthorBean author;
        private CommitterBean committer;
        private String message;
        private TreeBean tree;
        private String url;
        private int comment_count;

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public CommitterBean getCommitter() {
            return committer;
        }

        public void setCommitter(CommitterBean committer) {
            this.committer = committer;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public TreeBean getTree() {
            return tree;
        }

        public void setTree(TreeBean tree) {
            this.tree = tree;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getComment_count() {
            return comment_count;
        }

        public void setComment_count(int comment_count) {
            this.comment_count = comment_count;
        }

        public static class AuthorBean {
            /**
             * name : Vipul A M
             * email : vipulnsward@gmail.com
             * date : 2017-09-06T12:56:44Z
             */

            private String name;
            private String email;
            private String date;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class CommitterBean {
            /**
             * name : GitHub
             * email : noreply@github.com
             * date : 2017-09-06T12:56:44Z
             */

            private String name;
            private String email;
            private String date;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class TreeBean {
            /**
             * sha : 6bf1bb5e06d7f12f13190c3c820fcd0ee61ffe25
             * url : https://api.github.com/repos/rails/rails/git/trees/6bf1bb5e06d7f12f13190c3c820fcd0ee61ffe25
             */

            private String sha;
            private String url;

            public String getSha() {
                return sha;
            }

            public void setSha(String sha) {
                this.sha = sha;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }

    public static class AuthorBeanX {
        /**
         * login : vipulnsward
         * id : 567626
         * avatar_url : https://avatars1.githubusercontent.com/u/567626?v=4
         * gravatar_id :
         * url : https://api.github.com/users/vipulnsward
         * html_url : https://github.com/vipulnsward
         * followers_url : https://api.github.com/users/vipulnsward/followers
         * following_url : https://api.github.com/users/vipulnsward/following{/other_user}
         * gists_url : https://api.github.com/users/vipulnsward/gists{/gist_id}
         * starred_url : https://api.github.com/users/vipulnsward/starred{/owner}{/repo}
         * subscriptions_url : https://api.github.com/users/vipulnsward/subscriptions
         * organizations_url : https://api.github.com/users/vipulnsward/orgs
         * repos_url : https://api.github.com/users/vipulnsward/repos
         * events_url : https://api.github.com/users/vipulnsward/events{/privacy}
         * received_events_url : https://api.github.com/users/vipulnsward/received_events
         * type : User
         * site_admin : false
         */

        private String login;
        private int id;
        private String avatar_url;
        private String gravatar_id;
        private String url;
        private String html_url;
        private String followers_url;
        private String following_url;
        private String gists_url;
        private String starred_url;
        private String subscriptions_url;
        private String organizations_url;
        private String repos_url;
        private String events_url;
        private String received_events_url;
        private String type;
        private boolean site_admin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getGists_url() {
            return gists_url;
        }

        public void setGists_url(String gists_url) {
            this.gists_url = gists_url;
        }

        public String getStarred_url() {
            return starred_url;
        }

        public void setStarred_url(String starred_url) {
            this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
            return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
            this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
            return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
            this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
            return repos_url;
        }

        public void setRepos_url(String repos_url) {
            this.repos_url = repos_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getReceived_events_url() {
            return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
            this.received_events_url = received_events_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isSite_admin() {
            return site_admin;
        }

        public void setSite_admin(boolean site_admin) {
            this.site_admin = site_admin;
        }
    }

    public static class CommitterBeanX {
        /**
         * login : web-flow
         * id : 19864447
         * avatar_url : https://avatars3.githubusercontent.com/u/19864447?v=4
         * gravatar_id :
         * url : https://api.github.com/users/web-flow
         * html_url : https://github.com/web-flow
         * followers_url : https://api.github.com/users/web-flow/followers
         * following_url : https://api.github.com/users/web-flow/following{/other_user}
         * gists_url : https://api.github.com/users/web-flow/gists{/gist_id}
         * starred_url : https://api.github.com/users/web-flow/starred{/owner}{/repo}
         * subscriptions_url : https://api.github.com/users/web-flow/subscriptions
         * organizations_url : https://api.github.com/users/web-flow/orgs
         * repos_url : https://api.github.com/users/web-flow/repos
         * events_url : https://api.github.com/users/web-flow/events{/privacy}
         * received_events_url : https://api.github.com/users/web-flow/received_events
         * type : User
         * site_admin : false
         */

        private String login;
        private int id;
        private String avatar_url;
        private String gravatar_id;
        private String url;
        private String html_url;
        private String followers_url;
        private String following_url;
        private String gists_url;
        private String starred_url;
        private String subscriptions_url;
        private String organizations_url;
        private String repos_url;
        private String events_url;
        private String received_events_url;
        private String type;
        private boolean site_admin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getGists_url() {
            return gists_url;
        }

        public void setGists_url(String gists_url) {
            this.gists_url = gists_url;
        }

        public String getStarred_url() {
            return starred_url;
        }

        public void setStarred_url(String starred_url) {
            this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
            return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
            this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
            return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
            this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
            return repos_url;
        }

        public void setRepos_url(String repos_url) {
            this.repos_url = repos_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getReceived_events_url() {
            return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
            this.received_events_url = received_events_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isSite_admin() {
            return site_admin;
        }

        public void setSite_admin(boolean site_admin) {
            this.site_admin = site_admin;
        }
    }

    public static class ParentsBean {
        /**
         * sha : 18f342d82a380d5bd23c33018818224d32b69a95
         * url : https://api.github.com/repos/rails/rails/commits/18f342d82a380d5bd23c33018818224d32b69a95
         * html_url : https://github.com/rails/rails/commit/18f342d82a380d5bd23c33018818224d32b69a95
         */

        private String sha;
        private String url;
        private String html_url;

        public String getSha() {
            return sha;
        }

        public void setSha(String sha) {
            this.sha = sha;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }
    }
}
