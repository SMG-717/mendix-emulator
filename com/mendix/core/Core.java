package com.mendix.core;

import com.mendix.core.actionmanagement.CoreAction;
import com.mendix.core.actionmanagement.ListenersRegistry;
import com.mendix.core.actionmanagement.MicroflowCallBuilder;
import com.mendix.core.actionmanagement.UserActionCallBuilder;
import com.mendix.core.conf.Configuration;
import com.mendix.datahub.connector.eventtracking.Metrics;
import com.mendix.datastorage.DataStorage;
import com.mendix.datastorage.XPathQuery;
import com.mendix.externalinterface.connector.RequestHandler;
import com.mendix.http.Http;
import com.mendix.integration.Integration;
import com.mendix.systemwideinterfaces.connectionbus.data.IDataTable;
import com.mendix.systemwideinterfaces.connectionbus.requests.types.IGetRequest;
import com.mendix.systemwideinterfaces.connectionbus.requests.types.IOQLTextGetRequest;
import com.mendix.systemwideinterfaces.connectionbus.requests.types.IXPathTextGetRequest;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IDataType;
import com.mendix.systemwideinterfaces.core.ILanguage;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IProfiler;
import com.mendix.systemwideinterfaces.core.ISession;
import com.mendix.systemwideinterfaces.core.IUser;
import com.mendix.systemwideinterfaces.core.UserAction;
import com.mendix.systemwideinterfaces.core.connectionbus.requests.IRetrievalSchema;
import com.mendix.systemwideinterfaces.core.meta.IMetaAssociation;
import com.mendix.systemwideinterfaces.core.meta.IMetaObject;
import com.mendix.systemwideinterfaces.core.meta.IMetaPrimitive;

public final class Core {

    public static void addRequestHandler(java.lang.String path, RequestHandler requestHandler) {}
    public static void addUserAction(java.lang.Class<? extends UserAction<?>> userActionClass) { }
    public static void addWebSocketEndpoint(java.lang.String path, javax.websocket.Endpoint endpoint) { }
    public static boolean authenticate(IContext context, IUser user, java.lang.String password) throws CoreException {
        return false;
    }
    public static void buildException(java.lang.StringBuilder trace, java.lang.Throwable throwable) { }
    public static boolean change(IContext context, IMendixObject object, java.util.Map<java.lang.String,java.lang.String> changes) throws CoreException {
        return false;
     }
    public static java.util.concurrent.Future<java.lang.Boolean> changeAsync(IContext context, IMendixObject obj, java.util.Map<java.lang.String,java.lang.String> changes) {
        return null;
    }
    public static IMendixObject commit(IContext context, IMendixObject object) throws CoreException {
        return null;
    }
    public static java.util.List<IMendixObject> commit(IContext context, java.util.List<IMendixObject> objects) {
        return null;
    }
    public static java.util.List<java.util.concurrent.Future<java.util.List<IMendixObject>>> commitAsync(IContext context, java.util.List<IMendixObject> objects) {
        return null;
    }
    public static IMendixObject commitWithoutEvents(IContext context, IMendixObject object) {
        return null;
    }
    public static java.util.List<IMendixObject> commitWithoutEvents(IContext context, java.util.List<IMendixObject> objects) {
        return null;
    }
    public static IDataType createDataType(java.lang.String type) {
        return null;
    }
    public static IDataType createDataType(java.lang.String objectType, java.lang.String attributeName) {
        return null;
    }
    public static IMendixIdentifier createMendixIdentifier(long guid) {
        return null;
    }
    public static IMendixIdentifier createMendixIdentifier(java.lang.String guid) {
        return null;
    }
    public static IOQLTextGetRequest createOQLTextGetRequest() {
        return null;
    }
    public static IOQLTextGetRequest createOQLTextGetRequestFromDataSet(java.lang.String dataSetQualifiedName) {
        return null;
    }
    public static IRetrievalSchema createRetrievalSchema() {
        return null;
    }
    public static IContext createSystemContext() {
        return null;
    }
    public static XPathQuery createXPathQuery(java.lang.String xpathQuery) {
        return null;
    }
    public static IXPathTextGetRequest createXPathTextGetRequest() {
        return null;
    }
    public static DataStorage dataStorage() {
        return null;
    }
    public static boolean delete(IContext context, IMendixObject... objects) {
        return false;
     }
    public static boolean delete(IContext context, java.util.List<IMendixObject> objectList) {
        return false;
     }
    public static java.util.List<java.util.concurrent.Future<java.lang.Boolean>> deleteAsync(IContext context, IMendixObject object, boolean useDeleteBehavior) {
        return null;
    }
    public static java.util.List<java.util.concurrent.Future<java.lang.Boolean>> deleteAsync(IContext context, java.util.List<IMendixObject> objects, boolean useDeleteBehavior) {
        return null;
    }
    public static boolean deleteWithoutEvents(IContext context, java.util.List<IMendixObject> objects, boolean useDeleteBehavior) {
        return false;
     }
    public static java.lang.Object evaluateExpression(IContext context, java.util.Map<java.lang.String,java.lang.Object> variables, java.lang.String expression) {
        return null;
    }
    public static <R> R execute(IContext context, java.lang.String microflowName, boolean executeInTransaction, java.util.Map<java.lang.String,java.lang.Object> params) throws CoreException {
        return null;
    }
    public static <R> R execute(IContext context, java.lang.String name, java.lang.Object... params) throws CoreException {
        return null;
    }
    public static <R> R execute(IContext context, java.lang.String microflowName, java.util.Map<java.lang.String,java.lang.Object> params) throws CoreException {
        return null;
    }
    public static <T extends CoreAction<R>, R> java.util.concurrent.Future<R> execute(T action) {
        return null;
    }
    public static <R> java.util.concurrent.Future<R> executeAsync(IContext context, java.lang.String microflowName, boolean executeInTransaction, java.util.Map<java.lang.String,java.lang.Object> params) throws CoreException {
        return null;
    }
    public static <R> java.util.concurrent.Future<R> executeAsync(IContext context, java.lang.String actionName, java.lang.Object... params) throws CoreException {
        return null;
    }
    public static <T extends CoreAction<R>, R> R executeSync(T action) throws CoreException {
        return null;
    }
    public static <T extends CoreAction<R>, R> void executeVoid(T action) { }
    public static int getActionQueueSize() {
        return 0;
    }
    public static int getActiveActionCount() {
        return 0;
    }
    public static ISession getActiveSession(java.lang.String userName) {
        return null;
    }
    public static java.util.Collection<? extends ISession> getActiveSessions() {
        return null;
    }
    public static java.lang.Iterable<IMendixObject> getAllMendixObjects() {
        return null;
    }
    public static long getCompletedActionCount() {
        return 0;
    }
    public static long getConcurrentUserCount(boolean anonymous) {
        return 0;
    }
    public static Configuration getConfiguration() {
        return null;
    }
    public static int getCurrentPoolSize() {
        return 0;
    }
    public static java.lang.String getDatabaseChildColumnName(IMetaAssociation metaAssociation) {
        return null;
    }
    public static java.lang.String getDatabaseColumnName(IMetaPrimitive metaPrimitive) {
        return null;
    }
    public static java.lang.String getDatabaseParentColumnName(IMetaAssociation metaAssociation) {
        return null;
    }
    public static java.lang.String getDatabaseTableName(IMetaAssociation metaAssociation) {
        return null;
    }
    public static java.lang.String getDatabaseTableName(IMetaObject metaObject) {
        return null;
    }
    public static ILanguage getDefaultLanguage() {
        return null;
    }
    public static java.io.InputStream getFileDocumentContent(IContext context, IMendixObject fileDocument) {
        return null;
    }
    public static java.io.InputStream getImage(IContext context, IMendixObject imageDocument, boolean retrieveThumbnail) {
        return null;
    }
    public static java.util.Map<java.lang.String,IDataType> getInputParameters(java.lang.String actionName) {
        return null;
    }
    public static java.lang.String getInternationalizedString(IContext context, java.lang.String key, java.lang.Object... args) {
        return null;
    }
    public static java.lang.String getInternationalizedString(java.lang.String languageCode, java.lang.String key, java.lang.Object... args) {
        return null;
    }
    public static ILanguage getLanguage(IContext context) {
        return null;
    }
    public static int getLargestPoolSize() {
        return 0;
    }
    public static ListenersRegistry getListenersRegistry() {
        return null;
    }
    public static java.util.Locale getLocale(IContext context) {
        return null;
    }
    public static java.util.Locale getLocale(java.lang.String languageCode) {
        return null;
    }
    public static com.mendix.logging.ILogNode getLogger(java.lang.String name)  {
        return null;
    }
    public static int getMaximumNumberConcurrentUsers() throws CoreException {
        return 0;
    }
    public static IMetaAssociation getMetaAssociation(java.lang.String association) {
        return null;
    }
    public static java.lang.Iterable<IMetaAssociation> getMetaAssociations() {
        return null;
    }
    public static IMetaObject getMetaObject(java.lang.String metaObjectName) {
        return null;
    }
    public static java.lang.Iterable<IMetaObject> getMetaObjects() {
        return null;
    }
    public static IMetaPrimitive getMetaPrimitive(java.lang.String qualifiedAttributeName) {
        return null;
    }
    public static java.util.Set<java.lang.String> getMicroflowNames() {
        return null;
    }
    public static java.lang.String getModelVersion() {
        return null;
    }
    public static long getNamedUserCount()  {
        return 0;
    }
    public static long getNumberConcurrentSessions() {
        return 0;
    }
    public static IProfiler getProfiler()  {
        return null;
    }
    public static java.util.UUID getProjectId() {
        return null;
    }
    public static IDataType getReturnType(java.lang.String actionName) {
        return null;
    }
    public static int getScheduledActionCount() {
        return 0;
    }
    public static ISession getSessionById(java.util.UUID sessionId) {
        return null;
    }
    public static java.util.Date getStartupDateTime() {
        return null;
    }
    public static java.util.List<java.lang.String> getSubtypesOf(java.lang.String objectType) {
        return null;
    }
    public static IUser getUser(IContext context, java.lang.String userName) throws CoreException {
        return null;
    }
    public static java.lang.String getXASId() {
        return null;
    }
    public static Http http() {
        return null;
    }
    public static void initialize(com.mendix.core.internal.ICore core, Http http, Integration integration, DataStorage dataStorage, Metrics metrics) { }
    public static ISession initializeGuestSession() throws CoreException {
        return null;
    }
    public static ISession initializeSession(IUser user, java.lang.String currentSessionId) throws CoreException {
        return null;
    }
    public static IMendixObject instantiate(IContext context, java.lang.String objectType) {
        return null;
    }
    public static java.util.concurrent.Future<IMendixObject> instantiateAsync(IContext context, java.lang.String objectType) {
        return null;
    }
    public static Integration integration() {
        return null;
    }
    public static boolean isInDevelopment()  {
        return false;
     }
    public static boolean isSubClassOf(IMetaObject superObject, IMetaObject type) {
        return false;
     }
    public static boolean isSubClassOf(java.lang.String superClass, short typeHash) {
        return false;
     }
    public static boolean isSubClassOf(java.lang.String superClass, java.lang.String type) {
        return false;
     }
    public static ISession login(java.lang.String userName, java.lang.String password) throws CoreException {
        return null;
    }
    public static ISession login(java.lang.String userName, java.lang.String password, com.mendix.m2ee.api.IMxRuntimeRequest request) throws CoreException {
        return null;
    }
    public static ISession login(java.lang.String userName, java.lang.String password, java.lang.String currentSessionId) throws CoreException {
        return null;
    }
    public static ISession login(java.util.Map<java.lang.String,? extends java.lang.Object> params) throws CoreException {
        return null;
    }
    public static void logout(ISession session) { }
    public static Metrics metrics() {
        return null;
    }
    public static MicroflowCallBuilder microflowCall(java.lang.String name) {
        return null;
    }
    public static void registerLogSubscriber(com.mendix.logging.LogSubscriber subscriber)  { }
    public static void registerProfiler(IProfiler profiler)  { }
    public static boolean removeScheduledFuture(java.util.concurrent.RunnableScheduledFuture<?> scheduledFuture) {
        return false;
     }
    public static <R> java.util.concurrent.ScheduledFuture<?> reschedule(java.util.concurrent.RunnableScheduledFuture<R> scheduledFuture, CoreAction<R> action, long newDelay, java.util.concurrent.TimeUnit timeUnit) {
        return null;
    }
    public static java.lang.Object resolveTokens(IContext context, java.lang.String text) {
        return null;
    }
    public static java.util.List<IMendixObject> retrieveByPath(IContext context, IMendixObject mxObject, java.lang.String path) {
        return null;
    }
    public static java.util.List<IMendixObject> retrieveByPath(IContext context, IMendixObject mxObject, java.lang.String path, boolean isSelfAssociationChild) {
        return null;
    }
    public static IMendixObject retrieveId(IContext context, IMendixIdentifier id) throws CoreException {
        return null;
    }
    public static java.util.concurrent.Future<IMendixObject> retrieveIdAsync(IContext context, IMendixIdentifier id) {
        return null;
    }
    public static java.util.List<IMendixObject> retrieveIdList(IContext context, java.util.List<IMendixIdentifier> ids) throws CoreException {
        return null;
    }
    public static java.util.List<IMendixObject> retrieveIdList(IContext context, java.util.List<IMendixIdentifier> ids, int amount, int offset, java.util.Map<java.lang.String,java.lang.String> sort) throws CoreException {
        return null;
    }
    public static java.util.concurrent.Future<java.util.List<IMendixObject>> retrieveIdListAsync(IContext context, java.util.List<IMendixIdentifier> ids) {
        return null;
    }
    public static IDataTable retrieveOQLDataTable(IContext context, IGetRequest request) throws CoreException {
        return null;
    }
    public static IDataTable retrieveOQLDataTable(IContext context, java.lang.String oqlQuery) throws CoreException {
        return null;
    }
    public static IDataTable retrieveOQLDataTable(IContext context, java.lang.String oqlQuery, int amount, int offset) throws CoreException {
        return null;
    }
    public static java.util.concurrent.Future<IDataTable> retrieveOQLDataTableAsync(IContext context, IGetRequest request) {
        return null;
    }
    public static java.util.concurrent.Future<IDataTable> retrieveOQLDataTableAsync(IContext context, java.lang.String oqlQuery) {
        return null;
    }
    public static java.util.concurrent.Future<IDataTable> retrieveOQLDataTableAsync(IContext context, java.lang.String oqlQuery, int amount, int offset) {
        return null;
    }
    public static java.util.List<IMendixObject> retrieveXPathQuery(IContext context, java.lang.String xpathQuery) throws CoreException {
        return null;
    }
    public static java.util.List<IMendixObject> retrieveXPathQuery(IContext context, java.lang.String xpathQuery, int depth) throws CoreException {
        return null;
    }
    public static java.util.List<IMendixObject> retrieveXPathQuery(IContext context, java.lang.String xpathQuery, int amount, int offset, java.util.Map<java.lang.String,java.lang.String> sort) throws CoreException {
        return null;
    }
    public static java.util.List<IMendixObject> retrieveXPathQuery(IContext context, java.lang.String xpathQuery, int amount, int offset, java.util.Map<java.lang.String,java.lang.String> sort, int depth) throws CoreException {
        return null;
    }
    public static java.lang.Long retrieveXPathQueryAggregate(IContext context, java.lang.String xpathQuery) {
        return null;
    }
    public static java.util.concurrent.Future<java.lang.Long> retrieveXPathQueryAggregateAsync(IContext context, java.lang.String xpathQuery) {
        return null;
    }
    public static java.util.concurrent.Future<java.lang.Double> retrieveXPathQueryAggregateAsyncDouble(IContext context, java.lang.String xpathQuery) {
        return null;
    }
    public static java.lang.Double retrieveXPathQueryAggregateDouble(IContext context, java.lang.String xpathQuery) {
        return null;
    }
    public static java.lang.Long retrieveXPathQueryAggregateSchema(IContext context, java.lang.String xpathQuery, IRetrievalSchema retrievalSchema) {
        return null;
    }
    public static java.lang.Long retrieveXPathQueryAggregateSchema(IContext context, java.lang.String xpathQuery, IRetrievalSchema retrievalSchema, boolean disableSecurity) {
        return null;
    }
    public static java.util.concurrent.Future<java.util.List<IMendixObject>> retrieveXPathQueryAsync(IContext context, java.lang.String xpathQuery, int amount, int offset, java.util.Map<java.lang.String,java.lang.String> sort, int depth) {
        return null;
    }
    public static IDataTable retrieveXPathQueryRaw(IContext context, java.lang.String xpathQuery, int amount, int offset, java.util.Map<java.lang.String,java.lang.String> sort, int depth) throws CoreException {
        return null;
    }
    public static java.util.List<IMendixObject> retrieveXPathSchema(IContext context, java.lang.String xpathQuery, IRetrievalSchema retrievalSchema, boolean shouldRetrieveCount) throws CoreException {
        return null;
    }
    public static java.util.List<IMendixObject> retrieveXPathSchema(IContext context, java.lang.String xpathQuery, IRetrievalSchema retrievalSchema, boolean shouldRetrieveCount, boolean disableSecurity) throws CoreException {
        return null;
    }
    public static IDataTable retrieveXPathSchemaRaw(IContext context, java.lang.String xpathQuery, boolean shouldRetrieveCount, IRetrievalSchema retrievalSchema) throws CoreException {
        return null;
    }
    public static IMendixObject rollback(IContext context, IMendixObject object) throws CoreException {
        return null;
    }
    public static java.util.concurrent.Future<IMendixObject> rollbackAsync(IContext context, IMendixObject object) {
        return null;
    }
    public static <R> java.util.concurrent.RunnableScheduledFuture<?> schedule(CoreAction<R> action, long delay, java.util.concurrent.TimeUnit timeUnit) {
        return null;
    }
    public static <R> java.util.concurrent.RunnableScheduledFuture<?> schedule(java.lang.String actionName, java.util.Date date) {
        return null;
    }
    public static <R> void scheduleAtFixedRate(CoreAction<R> action, long initialDelay, long period, java.util.concurrent.TimeUnit timeUnit) { }
    public static <R> void scheduleAtFixedRate(CoreAction<R> action, java.util.Date firstRun, long period, java.util.concurrent.TimeUnit timeUnit) { }
    public static <R> void scheduleAtFixedRate(java.lang.String actionName, java.util.Date firstRun, long period, java.util.concurrent.TimeUnit timeUnit, java.lang.String name, java.lang.String description) { }
    public static <R> void scheduleWithFixedDelay(CoreAction<R> action, long initialDelay, long delay, java.util.concurrent.TimeUnit timeUnit) { }
    public static void storeFileDocumentContent(IContext context, IMendixObject fileDocument, java.io.InputStream inputStream) { }
    public static void storeFileDocumentContent(IContext context, IMendixObject fileDocument, java.lang.String fileName, java.io.InputStream inputStream) { }
    public static void storeImageDocumentContent(IContext context, IMendixObject imageDocument, java.io.InputStream inputStream, int thumbnailWidth, int thumbnailHeight) { }
    public static void unregisterProfiler()  { }
    public static UserActionCallBuilder userActionCall(java.lang.String name) {
        return null;
    }
}
